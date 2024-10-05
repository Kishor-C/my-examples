function fetchJson() {
    let url = 'https://jsonplaceholder.typicode.com/users';
    let xhr = new XMLHttpRequest();
    xhr.open('GET', url, true);
    xhr.send();
    xhr.onreadystatechange = () => {
        if (xhr.readyState == 4) {
            let jsonResponse = xhr.responseText;
            document.getElementById('main').textContent = jsonResponse;
        }
    }
}

async function fetchJson() {
    let url = 'https://jsonplaceholder.typicode.com/users';
    let res = await fetch(url)
    let value = await res.json();
    document.getElementById('main').textContent = JSON.stringify(value);
}