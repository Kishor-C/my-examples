const CACHE_NAME = 'v1-cache';
const URLS_TO_CACHE = [
  '/',
  '/index.html',
  '/app.js',
  
];

self.addEventListener('install', event => {
    event.waitUntil(
      caches.open(CACHE_NAME)
        .then(cache => {
          console.log('Opened cache');
          return cache.addAll(URLS_TO_CACHE);
        })
    );
  });

  self.addEventListener('fetch', event => {
    event.respondWith(
      caches.match(event.request)
        .then(response => {
          // Cache hit - return the cached response
          if (response) {
            return response;
          }
  
          // Clone the request. A request is a stream, and we need to clone it since it can be consumed only once.
          const fetchRequest = event.request.clone();
  
          return fetch(fetchRequest).then(response => {
            // Check if we received a valid response
            if (!response || response.status !== 200 || response.type !== 'basic') {
              return response;
            }
  
            // Clone the response. A response is a stream, and we need to clone it because we want to consume 
            //it as well as cache it.
            const responseToCache = response.clone();
  
            caches.open(CACHE_NAME)
              .then(cache => {
                cache.put(event.request, responseToCache);
              });
  
            return response;
          });
        })
    );
  });
  

//   self.addEventListener('activate', event => {
//     const cacheWhitelist = [CACHE_NAME];
  
//     event.waitUntil(
//       caches.keys().then(cacheNames => {
//         return Promise.all(
//           cacheNames.map(cacheName => {
//             if (cacheWhitelist.indexOf(cacheName) === -1) {
//               return caches.delete(cacheName);
//             }
//           })
//         );
//       })
//     );
//   });


// console.log('service worker in sw.js');
// //console.log({self});
// //
// // // self is a server worker objects
// self.addEventListener('install', function(event) {
//     console.log('Service Worker installing.');
//     // Perform install steps (like caching)
// });

// self.addEventListener('activate', function(event) {
//     console.log('Service Worker activating.');
//     // Perform activation steps (like cleaning old caches)
// });

// self.addEventListener('fetch', function(event) {
//     // service worker intercepts the fetch request
  
//     console.log('Fetching=', event.request);
   
// });

// //