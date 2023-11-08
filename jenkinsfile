pipeline{
agent any
stages 
{
    stage('Build') 
    {
        steps
        {
            echo "Building the Code.........."
            bat "mvn clean"
        }
    }
    stage('Compile') 
    {
        steps
        {
            echo "Compiling the Project.........."
            bat "mvn compile"
        }
    }
    stage('Test') 
    {
        steps
        {
            echo "Testing the Code.........."
            bat "mvn test"
        }
    }
    stage('Deploy') 
    {
        steps
        {
            echo "Deploying the Project.........."
        }
    }
}
}
