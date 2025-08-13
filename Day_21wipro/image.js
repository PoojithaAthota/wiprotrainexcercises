let images = [
    "https://tse3.mm.bing.net/th/id/OIP.-edFDcSqlon5xMykpg5qMgHaEK?pid=Api&P=0&h=180",
    "https://tse4.mm.bing.net/th/id/OIP.gabnTIrb9_VUBujEuAZp1QHaEK?pid=Api&P=0&h=180",
    "https://tse3.mm.bing.net/th/id/OIP.7-zyZ2NnUnnVlzYKB2ym0QHaE7?pid=Api&P=0&h=180",
    "https://tse1.mm.bing.net/th/id/OIP.8DAojpUm7coxEhvVz3RHrgHaE8?pid=Api&P=0&h=180"
];

let currentIndex = 0;

function showImage(index) {
    document.getElementById("galleryImage").src = images[index];
}

function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    showImage(currentIndex);
}

function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    showImage(currentIndex);
}

showImage(currentIndex);
