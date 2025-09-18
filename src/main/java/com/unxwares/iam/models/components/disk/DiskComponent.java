package com.unxwares.iam.models.components.disk;

import com.unxwares.iam.models.components.Component;
import com.unxwares.iam.models.components.ComponentTypes;

public class DiskComponent extends Component {
    @Override
    public ComponentTypes getType() {
        return ComponentTypes.DISK;
    }
}
