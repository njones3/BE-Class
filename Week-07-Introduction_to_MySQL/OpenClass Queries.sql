USE sakila;
SELECT COUNT(*) FROM city
INNER JOIN country 
USING (country_id)
WHERE city LIKE "Ab%";

SELECT COUNT(*) AS "Count"
FROM city
INNER JOIN country
USING (country_id)
WHERE city LIKE "Ab%";

SELECT customer_id, AVG(amount)
FROM payment
GROUP BY customer_id
LIMIT 5;

SELECT customer_id, ROUND(AVG(amount),2)
FROM payment
GROUP BY customer_id
LIMIT 5;

SELECT customer_id AS "Id", ROUND(AVG(amount),2) AS "Average Spent"
FROM payment
GROUP BY customer_id
LIMIT 5;

SELECT customer_id, first_name, last_name, ROUND(AVG(amount),2)
FROM payment
INNER JOIN customer
USING (customer_id)
GROUP BY customer_id
LIMIT 5;

SELECT customer_id AS "Id", first_name AS "First Name", last_name AS "Last Name", ROUND(AVG(amount),2) AS "Average Spent"
FROM payment
INNER JOIN customer
USING (customer_id)
GROUP BY customer_id
LIMIT 5;

SELECT customer_id AS "Id", CONCAT(first_name, ' ' , last_name) AS "Customer Name", ROUND(AVG(amount),2) AS "Average Spent"
FROM payment
INNER JOIN customer
USING (customer_id)
GROUP BY customer_id
LIMIT 5;

SELECT customer_id AS "Id", COUNT(*) AS "Number of Rentals"
FROM rental
WHERE customer_id IN (SELECT customer_id FROM customer WHERE first_name = "AUSTIN")
GROUP BY customer_id;

SELECT staff_id, first_name, last_name, store_id, address, city, country
FROM staff
JOIN store USING (store_id)
JOIN address ON (store.address_id = address.address_id)
JOIN city ON (address.city_id = city.city_id)
JOIN country ON (city.country_id = country.country_id);




SELECT store_id FROM store;
