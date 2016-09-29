# WSO2 API Manager Feature Demo #

**Environment Setup**
	
  1. Add a host entry to the host machine
     - `docker-machine start` - will start the docker machine if you are using `windows` or `OSx`.
     - `docker-machine ip` - will display the IP address of the docker machine.
     - Open the `hosts` file of the host machine, and add an entry as `<ip-address> docker.machine`.
  2. Download WSO2 product binary packages
     - WSO2 API Manager 1.10.0 - `wso2am-1.10.0.zip`
     - WSO2 Data Analytics Server 3.0.1 - `wso2das-3.0.1.zip`
  3. Add these 2 binary packs to the `packs` directory.
  
**The Microservice (REST API)**

  1. Start the Microservice container
     - `docker-compose up -d mres` - will create the container image and boot it up.
     - `docker ps` - lists the running container information. 
     - Observe the NAME value ( res.apimdemo.com ) of the containers.
  2. Try the Swagger definition
     - [http://docker.machine:8080/swagger?path=/matches](http://docker.machine:8080/swagger?path=/matches)
  3. Try API resources
     - [http://docker.machine:8080/matches/EUL2016/results](http://docker.machine:8080/matches/EUL2016/results)
     - [http://docker.machine:8080/matches/EUL2016/results/4](http://docker.machine:8080/matches/EUL2016/results/4)
     
**Supporting server instances**
  1. Start the databse container
     - `docker-compose up -d dbs` - will create the database container image and boot it up.
     - Wait for a few seconds until the database server becomes ready to be used.
  2. Start the Analytics container
     - `docker-compose up -d das` - will create the analytics profile container image and boot it up.

**WSO2 API Manager (API-M)**

  1. Start the API-M container
     - `docker-compose up -d apim` - will create the API-M container image and boot it up.
     - `docker ps` - lists the running containers information. 
     - Observe the NAME values ( api.apimdemo.com, das.apimdemo.com ) of the containers.
  2. Open API-M user interfaces (user=admin, password=admin).
     - API-M Admin Console [https://docker.machine:9443/carbon](https://docker.machine:9443/carbon)
     - API-M Publisher [https://docker.machine:9443/publisher](https://docker.machine:9443/publisher)
     - API-M Store [https://docker.machine:9443/store](https://docker.machine:9443/store)
  3. Publish the API using the Swagger definition of the Microservice.
     - Create an API on API-M publisher.
     - Import swagger definition from `apim-feature-demo/mres/swagger.json` of the repository.
     - Provide a proper resource path (i.e. `/uefa`)
     - Go to the next page and add the URL `http://res.apimdemo.com:8080` as the Managed API URL.
     - Select a few throttling tiers and publish the API.
  4. Subscribe to the API via the API-M Store.
  5. Try the API with Swagger based API Console on the API-M Store UI.
  6. Or, use a REST client like [POSTMAN](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en)
     - `https://docker.machine:8243/uefa/1.0/matches/EUL2016/results`
     - `https://docker.machine:8243/uefa/1.0/matches/EUL2016/results/8`

**When You are done...**

  1. Run `docker stop $(docker ps -a -q)` to stop all containers.
  2. Run `docker-machine stop` to stop the machine.
  
