# AWS
1. Slides e anotações sobre como usar a AWS Academy
2. EC2 - Launch Instance
3. Máquina Ubuntu, Micro - Todos free tier
4. Configuramos regras de segurança: SSH, HTTP, HTTPS, (Advanced) Custom TCP 8000 anywhere
5. Conectamos na instância  
```
sudo apt-get update
sudo apt-get install python3.12-venv (virtual enviroment - podemos adicionar dependências facilmente)
mkdir projeto-flask
cd projeto-flask
mkdir main
python3 -m venv venv
source venv/bin/activate
pip install flask
cd main
sudo nano index.py

'
from flask import Flask, jsonify, request

app = Flask(__name__)

scientists = [
    { 'name': 'Nikola Tesla', 'area': 'Physics' }
]

@app.route('/scientists')

def get_scientists ():
    return jsonify(scientists)

@app.route('/scientists', methods=['POST'])

def add_scientist():
    scientists.append(request.get_json())
    return '', 204

if __name__ == "__main__":
    app.run()
'
[ctrl s + ctrl x]

python3 index.py -> para testar
cd ..
pip install gunicorn
sudo nano /etc/systemd/system/projeto.service

'
[Unit]
Description=Gunicorn serve para instanciar uma simples aplicacao main.service
After=network.target

[Service]
User=ubuntu
Group=www-data
WorkingDirectory=/home/ubuntu/projeto-flask
ExecStart=/home/ubuntu/projeto-flask/venv/bin/gunicorn -b localhost:8000 main.index:app
Restart=always

[Install]
WantedBy=multi-user.target
'
[ctrl s + ctrl x]

sudo systemctl start projeto.service
curl localhost:8000/scientists -> para testar

sudo apt install nginx
sudo nano /etc/nginx/sites-available/default
... editamos o arquivo conforme solicitado para configurar o nginx
[ctrl s + ctrl x]

sudo systemctl start nginx
sudo systemctl restart nginx

acessamos http://ec2-52-91-55-61.compute-1.amazonaws.com/scientists

```
6. Depois lembrar de dar stop na instância e no Lab

## Por que é importante a localização do servidor?
* Porque existem Compliance e LGPD, que podem obrigar que os dados estejam em determinado país
* Porque o custo varia
* Porque a latência reduz ou aumenta

## Configuração de Segurança
1. Podemos pegar o IP da região e usar ela como IP de origem para conexões SSH, de forma que outros não consigam acessar.