public class ExamenCristina {

    String ip = "192.168.2";
    //Iterar sobre la ip teniendo en cuenta que solo tenemos el dato 255.255.255

    public void setIp(String ip) {

        System.out.println("las direcciones host posibles son: ");
        for (int i =0; i <255; i++){
            System.out.println(ip + i);

        }
    }
}
