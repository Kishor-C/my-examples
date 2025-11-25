const dbName = 'MyTestDB3';
let db;

// Open a database connection
const request = indexedDB.open(dbName, 1); // The second argument is the version number

// This event runs if it's a new database or if the database version is greater than the existing version
request.onupgradeneeded = function(event) {
    db = event.target.result;
    console.log(db);
    console.log('database upgraded')
    // Create an object store if it doesn't exist yet
    if (!db.objectStoreNames.contains('customers')) {
        const objectStore = db.createObjectStore('customers', { keyPath: 'id', autoIncrement: true });
        objectStore.createIndex('name', 'name', { unique: false });
        objectStore.createIndex('email', 'email', { unique: true });
    }
};

// Handle successful connection
request.onsuccess = function(event) {
    db = event.target.result;
    console.log('Database opened successfully:', db);
    //addCustomer({ name: 'John Doe', email: 'john.doe@example.com' });
    //updateCustomer(1, { name: 'John C', email: 'john.smith@example.com' })
    deleteCustomer(1);
    let data = getCustomer(1);
    console.log(data);

};

// Handle connection errors
request.onerror = function(event) {
    console.error('Database error:', event.target.errorCode);
};
// store logic
function addCustomer(customer) {
    console.log('calling addCustomer');
    const transaction = db.transaction(['customers'], 'readwrite');
    const objectStore = transaction.objectStore('customers');

    const request = objectStore.add(customer);

    request.onsuccess = function() {
        console.log('Customer has been added to your database.');
    };

    request.onerror = function() {
        console.error('Unable to add customer.');
    };
}
// find logic
function getCustomer(id) {
    const transaction = db.transaction(['customers']);
    const objectStore = transaction.objectStore('customers');

    const request = objectStore.get(id); // Fetch by primary key (id)

    request.onsuccess = function(event) {
        const customer = event.target.result;
        if (customer) {
            console.log('Customer retrieved:', customer);
        } else {
            console.log('Customer not found.');
        }
    };

    request.onerror = function() {
        console.error('Failed to retrieve customer.');
    };
}
// update logic
function updateCustomer(id, updatedData) {
    const transaction = db.transaction(['customers'], 'readwrite');
    const objectStore = transaction.objectStore('customers');

    // Retrieve the existing record first
    const request = objectStore.get(id);

    request.onsuccess = function(event) {
        const customer = event.target.result;
        if (customer) {
            // Merge updated data
            Object.assign(customer, updatedData);
            
            const updateRequest = objectStore.put(customer);
            updateRequest.onsuccess = function() {
                console.log('Customer updated successfully.');
            };
        } else {
            console.log('Customer not found.');
        }
    };

    request.onerror = function() {
        console.error('Failed to retrieve customer for update.');
    };
}
// delete logic
function deleteCustomer(id) {
    const transaction = db.transaction(['customers'], 'readwrite');
    const objectStore = transaction.objectStore('customers');

    const request = objectStore.delete(id);

    request.onsuccess = function() {
        console.log('Customer deleted successfully.');
    };

    request.onerror = function() {
        console.error('Failed to delete customer.');
    };
}
// get all customers logic
function getAllCustomers() {
    const transaction = db.transaction(['customers'], 'readonly');
    const objectStore = transaction.objectStore('customers');

    const request = objectStore.openCursor();
    request.onsuccess = function(event) {
        const cursor = event.target.result;
        if (cursor) {
            console.log('Customer:', cursor.value); // Log each customer
            cursor.continue(); // Move to the next item
        } else {
            console.log('No more customers.');
        }
    };
}

