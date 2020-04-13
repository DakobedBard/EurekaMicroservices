ONE INSTANCE OF REST I

HOW DO YOU CREATE A SINGLE INSTANCE OF ANY OBJECT IN ANY SPRING APPLICATION AND HAVE IT BE SHARED  BE ACROSS ANY NUMBER
OF CLASSES.  CREATE A BEAN, BEANS ARE BY DEFAULT SINGLETONS

so we create a bean 
@bean 
can add to any method and executes that method and maps it to the type

Then we can use the 
@Autowired annotation and will get that singleton object

lazy execution vs greedy execution
