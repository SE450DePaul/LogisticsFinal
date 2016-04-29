package logistics.utilities.loader.factory;

import logistics.utilities.loader.interfaces.Loader;

/**
 * Created by uchennafokoye on 4/23/16.
 */
public abstract class LoaderFactory {
    public abstract Loader createLoader(String file_type, String file_path);
    public static LoaderFactory getLoaderFactory(String type) {
        type = type.toLowerCase();
        if (type == "item"){
            return new ItemLoaderFactory();
        } else if (type == "facility"){
            return new FacilityLoaderFactory();
        } else if (type == "inventory"){
            return new InventoryLoaderFactory();
        }

        return null;
    }
}
