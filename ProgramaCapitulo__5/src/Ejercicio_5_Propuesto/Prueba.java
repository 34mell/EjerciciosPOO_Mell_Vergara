package Ejercicio_5_Propuesto;

public class Prueba {

    public static void main(String[] args) {
        // Crear un cliente particular
        ClienteParticular clienteParticular = new ClienteParticular();
        clienteParticular.setNombre("Klaus");
        clienteParticular.setApellidos("Mikaleson");
        clienteParticular.setNumeroDocumento("2392039");
        clienteParticular.setTelefono("479853");
        clienteParticular.setDireccion("Calle 235");

        // Crear una empresa
        Empresa empresa = new Empresa();
        empresa.setNombre("Mi Empresa");
        empresa.setRazonSocial("Razón Social S.A.");
        empresa.setNit("123-456-789");
        empresa.setTelefono("0987654321");
        empresa.setDireccion("Avenida Principal");

        // Crear una orden asociada a un cliente
        Orden orden = new Orden(1, empresa);
        orden.setCliente(clienteParticular); // Asociar la orden con el cliente particular
        orden.añadirItem(1, 5, new Producto(1, "Carpeta", "Carpeta anillada metálica", 1000));
        orden.añadirItem(2, 3, new Producto(2, "Tinta", "Tinta china de color negro.", 3000));
        orden.añadirItem(3, 2, new Producto(1, "Carpeta", "Carpeta anillada metálica", 1000));

        // Mostrar información
        System.out.println(orden);
        System.out.println(clienteParticular);
        System.out.println(empresa);
    }
}
