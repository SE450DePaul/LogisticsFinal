package logistics.utilities.loader.interfaces;

import logistics.utilities.exceptions.LoaderFileNotFoundException;
import logistics.facilityservice.Inventory;

import java.util.Collection;

/**
 * Created by uchennafokoye on 4/26/16.
 */
public interface FacilityLoader extends Loader<Inventory>
{
    Collection<Inventory> load() throws LoaderFileNotFoundException;
}
