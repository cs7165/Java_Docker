🐳 Prerequisites
#Java_Docker

AWS EC2 instance / Linux machine with Docker installed

Basic knowledge of terminal commands

📂 Project Structure
Java_Docker/
│── Dockerfile
│── src/
│   └── Main.java

📄 Dockerfile Explanation
# stable official Java runtime base image
FROM openjdk:17-jdk-alpine

# metadata
LABEL version="1.0"
LABEL description="A simple Java application"

# working directory
WORKDIR /app

# Copy source code into the container
COPY src/Main.java /app/Main.java

# Compile the Java code
RUN javac Main.java

# Run the Java application when the container starts
CMD ["java", "Main"]


FROM openjdk:17-jdk-alpine → uses a lightweight JDK 17 base image.

LABEL → adds metadata (like version, description).

WORKDIR /app → sets working directory inside the container.

COPY → copies Main.java into the container.

RUN javac Main.java → compiles Java code during image build.

CMD ["java", "Main"] → runs the compiled Java program when the container starts.

🚀 Steps to Build and Run
1. Clone or upload project

Upload Dockerfile and src/Main.java into your server (e.g., EC2).

2. Build Docker image
cd ~/Java_Docker
docker build -t java-app:1.0 .

3. Run container
docker run --name java-container java-app:1.0

4. Check running containers
docker ps -a

5. View logs/output
docker logs java-container

📝 Example Output

If your Main.java contains:

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Docker from Java!");
    }
}


Then when you run:

docker run --name java-container java-app:1.0


You’ll see:

Hello, Docker from Java!

🛑 Managing Containers

Stop container:

docker stop java-container


Remove container:

docker rm java-container


Remove image:

docker rmi java-app:1.0
