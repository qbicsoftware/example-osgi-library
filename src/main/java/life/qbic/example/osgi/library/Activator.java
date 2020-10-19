package life.qbic.example.osgi.library;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Class which contains the start(...) and stop(...) methods of the BundleActvator.
 */
public class Activator implements BundleActivator {

    @Override
    public void start( BundleContext context ) throws Exception {

        System.out.println( context.getBundle().getSymbolicName() +  ": Hello OSGi-World." );
    }

    @Override
    public void stop( BundleContext context ) throws Exception {

        System.out.println( context.getBundle().getSymbolicName() +  ": Bye OSGi-World." );
    }
}