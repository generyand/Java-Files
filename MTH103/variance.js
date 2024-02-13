const nums = [
    { value: 1, probability: 1 / 6 },
    { value: 2, probability: 1 / 6 },
    { value: 3, probability: 1 / 6 },
    { value: 4, probability: 1 / 6 },
    { value: 5, probability: 1 / 6 },
    { value: 6, probability: 1 / 6 }
];

const sum = nums.reduce((current, next) => current + next.value, 0);
const mean = sum / nums.length;
const variance = nums
    .map(obj => Math.pow(obj.value - mean, 2) * obj.probability)
    .reduce((current, next) => current + next, 0);
    
const standardDev = Math.sqrt(variance);

console.log(`Variance: ${variance.toFixed(4)}`);
console.log(`Standard Deviation: ${standardDev.toFixed(4)}`);