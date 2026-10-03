
const express = require('express');

const app = express();
const PORT = 3000;

app.get('/add', (req, res) => {
    const a = Number(req.query.a);
    const b = Number(req.query.b);

    res.json({
        number1: a,
        number2: b,
        result: a + b
    });
});

app.get('/', (req, res) => {
    res.send('JavaScript API is running! BY 24WH1A05BW');
});

app.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}`);
});