####Dockerfile  
    #Dockerfile FROM docker.elastic.co/elasticsearch/elasticsearch:7.6.2   
    ENV ES_VOLUME=/usr/share/elasticsearch/data    
    ENV ES_BIN=/usr/share/elasticsearch/bin  
    RUN mkdir $ES_VOLUME/dictionary  
    RUN $ES_BIN/elasticsearch-plugin install --batch analysis-nori  

