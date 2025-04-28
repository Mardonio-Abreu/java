public class pruebaApp {
    public static void main(String[] args) {

        Alumno alumno01 = new Alumno(99941, "Aaron", "Alvarez", "Avila");
        Alumno alumno02 = new Alumno(45628, "Bartolo", "Benitez", "Buenaventura");
        Alumno alumno03 = new Alumno(75314, "Carlos", "Casado", "Calzada");

        Calificacion calificacion01 = new Calificacion(1, 98741, "Algebra", 80);
        Calificacion calificacion02 = new Calificacion(2, 98741, "Geometria", 89);
        Calificacion calificacion03 = new Calificacion(3, 98741, "Estructuras de Datos", 98);

        Calificacion calificacion04 = new Calificacion(1, 45628, "Algebra II", 70);
        Calificacion calificacion05 = new Calificacion(2, 45628, "Geometria II", 99);
        Calificacion calificacion06 = new Calificacion(3, 45628, "Estructuras de Datos II", 88);

        Calificacion calificacion07 = new Calificacion(1, 75314, "Algebra III", 90);
        Calificacion calificacion08 = new Calificacion(2, 75314, "Geometria III", 79);
        Calificacion calificacion09 = new Calificacion(3, 75314, "Estructuras de Datos III", 68);


        //Llamar a los metodos AlumnoDAO & calificacionesDAO
        AlumnoDAO.leerAlumnos();
        CalificacionesDAO.leerCalificaciones();

//        //Insertar alumnos
//        AlumnoDAO.crearAlumno(alumno01);
//        AlumnoDAO.crearAlumno(alumno02);
//        AlumnoDAO.crearAlumno(alumno03);

        AlumnoDAO.leerAlumnos();

        //Insertar calificaciones
        CalificacionesDAO.crearCalificacion(calificacion01);
        CalificacionesDAO.crearCalificacion(calificacion02);
        CalificacionesDAO.crearCalificacion(calificacion03);
        CalificacionesDAO.crearCalificacion(calificacion04);
        CalificacionesDAO.crearCalificacion(calificacion05);
        CalificacionesDAO.crearCalificacion(calificacion06);
        CalificacionesDAO.crearCalificacion(calificacion07);
        CalificacionesDAO.crearCalificacion(calificacion08);
        CalificacionesDAO.crearCalificacion(calificacion09);

        //Mostar calificaciones
        CalificacionesDAO.leerCalificaciones();
    }
}
