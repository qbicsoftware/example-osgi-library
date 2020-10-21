package life.qbic.example

import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

/**
 * Activator of the bundle
 *
 * This class is the entry point of the OSGi bundle and implements the {@link BundleActivator}
 *
 * @since: 1.0.0
 *
 */
class Activator implements BundleActivator{

    @Override
    void start(BundleContext context ) throws Exception {
        println( context.getBundle().getSymbolicName() +  ": Hello OSGi-World." )
    }

    @Override
    void stop( BundleContext context ) throws Exception {
        println( context.getBundle().getSymbolicName() +  ": Bye OSGi-World." )
    }
}
