def call(imageName, tag) {
    echo "Scanning Docker Image..."
    sh """
    trivy image --exit-code 1 --severity HIGH,CRITICAL ${imageName}:${tag}
    """
}
