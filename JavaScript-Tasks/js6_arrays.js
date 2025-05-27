const events = [];
events.push({ name: "Art Festival", category: "art" });
events.push({ name: "Marathon", category: "cuisine" });
const musicEvents = events.filter(e => e.category === "music");
const eventCards = events.map(e => `<div>${e.name}</div>`);
console.log(musicEvents, eventCards);