./mvnw clean package
docker build -t palindrome .
docker run -i palindrome