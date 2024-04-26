/**
 * Setup the Database URL
 */

 // mongodb+srv://admin:<password>@cluster0-46e5h.mongodb.net/test?retryWrites=true&w=majority

const DB_USER = "admin"
const DB_PASSWORD = "admin"
const DB_NAME = "testdb"
const CLUSTER_HOST = "cluster0.fo1b1ax.mongodb.net"

// Setup the DB URI
exports.DB_URI= "mongodb+srv://"+DB_USER+":"+DB_PASSWORD+"@"+CLUSTER_HOST+"/"+DB_NAME+"?retryWrites=true&w=majority"