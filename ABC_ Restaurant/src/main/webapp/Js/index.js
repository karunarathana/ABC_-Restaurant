/**
 * 
 */
// Get the popup element
var popup = document.getElementById("popup");

// Get the button that opens the popup
var popupBtn = document.getElementById("popupBtn");

// Get the <span> element that closes the popup
var closeBtn = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the popup
popupBtn.onclick = function() {
    popup.style.display = "block";
}

// When the user clicks on <span> (x), close the popup
closeBtn.onclick = function() {
    popup.style.display = "none";
}

// When the user clicks anywhere outside of the popup, close it
window.onclick = function(event) {
    if (event.target == popup) {
        popup.style.display = "none";
    }
}
