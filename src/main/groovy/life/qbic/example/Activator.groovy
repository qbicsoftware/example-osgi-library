package life.qbic.example

import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

/**
 * <class short description - One Line!>
 *
 * <More detailed description - When to use, what it solves, etc.>
 *
 * @since: <versiontag>
 *
 */
class Activator implements BundleActivator{

    @Override
    public void start(BundleContext context ) throws Exception {

        System.out.println( context.getBundle().getSymbolicName() +  ": Hello OSGi-World." );
    }

    @Override
    public void stop( BundleContext context ) throws Exception {

        System.out.println( context.getBundle().getSymbolicName() +  ": Bye OSGi-World." );
    }
}
