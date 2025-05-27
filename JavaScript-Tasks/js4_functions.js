function addEvent(name, date) {
  return { name, date, registrations: 0 };
}
function registerUser(event) {
  event.registrations++;
  return event;
}
function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}
console.log(addEvent("Marathon", "2025-07-10"));