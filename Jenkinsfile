pipeline {
    agent any

	options {
		skipStagesAfterUnstable()
	}

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
		
		stage('Test') {
			steps {
				sh 'mvn test'
			}
		}

		stage('Deliver') {
			steps {
				sh './deliverScript.sh'
			}
		}
    }
}
