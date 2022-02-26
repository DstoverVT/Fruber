from flask import Flask, render_template

app = Flask(__name__)

@app.route('/trip')
def index():
    return render_template('trip.html')

@app.route('/wait')
def index():
    return render_template('wait.html')

@app.route('/driver')
def index():
    return render_template('driver.html')