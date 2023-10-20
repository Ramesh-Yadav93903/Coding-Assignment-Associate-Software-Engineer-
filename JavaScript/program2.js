const input = prompt("Enter a list of values separated by space:");
const numbers = input.split(' ').map(value => value.trim());
numbers.sort((a, b) => b - a);
console.log(numbers);