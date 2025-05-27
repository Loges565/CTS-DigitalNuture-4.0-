function submitRegistration(data) {
  fetch("https://api.example.com/register", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify(data)
  })
  .then(response => response.json())
  .then(result => alert("Registration successful"))
  .catch(error => alert("Registration failed"));
}
submitRegistration({ name: "Logeswaran", email: "logesit565@gmail.com" });