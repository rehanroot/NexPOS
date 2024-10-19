const express = require('express');
const http = require('http');
const socketIo = require('socket.io');

const app = express();
const server = http.createServer(app);
const io = socketIo(server);

// Serve static files (optional)
app.use(express.static('public'));

// Define a route for the root URL
app.get('/', (req, res) => {
    res.send('Hello, your real-time service is running!');
});

// Real-time connection
io.on('connection', (socket) => {
    console.log('New client connected');

    // Handle disconnection
    socket.on('disconnect', () => {
        console.log('Client disconnected');
    });

    // Example of handling events
    socket.on('customerUpdate', (data) => {
        console.log('Customer update received:', data);
        // Emit to all clients
        io.emit('customerUpdate', data);
    });

    socket.on('inventoryUpdate', (data) => {
        console.log('Inventory update received:', data);
        // Emit to all clients
        io.emit('inventoryUpdate', data);
    });

    // Add other real-time event handlers as needed
});

// Start the server
const PORT = process.env.PORT || 10001;
server.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
