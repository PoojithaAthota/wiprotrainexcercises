let cities = ["Pune", "Bangalore", "Hyderabad", "Chennai"];

function populateDropdown() {
    let dropdown = document.getElementById("cityDropdown");
    dropdown.innerHTML = '<option value="">-- Select City --</option>'; // Reset

    let sortedCities = cities.sort();

    sortedCities.forEach(function(city) {
        let option = document.createElement("option");
        option.value = city;
        option.textContent = city;
        dropdown.appendChild(option);
    });
}
