Basic auth-
userName-user
password-admin

POST  http://localhost:8090/checkoutcounter/bill
{
	"purchase": [{
		"productName": "apple",
		"quantity": "2"
	}, {
		"productName": "banana",
		"quantity": "1"
	}, {
		"productName": "cherry",
		"quantity": "2"
	}]
}
GET  http://localhost:8090/checkoutcounter/bill/{id}
GET  http://localhost:8090/checkoutcounter/bill/all

POST  http://localhost:8090/checkoutcounter/category
{
	"name": "Z",
	"salesTaxPercentage": "50"
}
GET http://localhost:8090/checkoutcounter/category/{id}
GET http://localhost:8090/checkoutcounter/category/all

POST  http://localhost:8090/checkoutcounter/product
{
	"name": "grapes",
	"cost": "50",
	"category": "Z"
}
GET  http://localhost:8090/checkoutcounter/product
GET  http://localhost:8090/checkoutcounter/product/all

