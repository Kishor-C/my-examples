if ('serviceWorker' in navigator) {
    navigator.serviceWorker.register('/sw.js', {scope : "/"})
        .then(function(registration) {        
            console.log('Service Worker registered with scope:', registration.scope);
        })
        .catch(function(error) {
            console.log('Service Worker registration failed:', error);
        });
        // if the page currently has the service worker
    if(navigator.serviceWorker.controller) {
        console.log('page has the service worker: installed, registered');
    }
    // register an handler to detect when a new or updated
    // service worker is installed & activated
    navigator.serviceWorker.oncontrollerchange = (ev) => {
        console.log('New service worker activated');
    }
    // remove or unregister the server workers
    // navigator.serviceWorker.getRegistrations().then((regs)=>{
    //     for(let reg of regs) {
    //         reg.unregister().then(isUnreg=>console.log(isUnreg))
    //     }
    // })
}





