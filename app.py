from flask import Flask
app = Flask(__name__)

@app.route("/")
def home():
    return "Hello Syed! Your app is deployed successfully."

if __name__ == "__main__":
    app.run()
