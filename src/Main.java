import com.mongodb.client.*;
import org.bson.Document;
import com.mongodb.client.result.*;
public class Main {
    public static void main(String[] args) {
        //Insertar Datos
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017/mydb")) {
            MongoDatabase db = mongoClient.getDatabase("miBaseDeDatos");
            MongoCollection<Document> collection = db.getCollection("usuarios");
            Document doc = new Document("nombre", "Juan").append("apellido", "Zaldumbide").append("edad", 31);
            collection.insertOne(doc);
            System.out.println("Documento insertado con éxito");
        }
        //Modificar Datos
        try(MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017/mydb")){
            MongoDatabase db = mongoClient.getDatabase("mydb");
            MongoCollection<Document> collection = db.getCollection("usuarios");
            Document doc = new Document("Nombre", "Juan");
            
        }
    }
}