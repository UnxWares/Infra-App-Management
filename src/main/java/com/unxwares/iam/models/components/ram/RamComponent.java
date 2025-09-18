package com.unxwares.iam.models.components.ram;

import com.unxwares.iam.models.components.Component;
import com.unxwares.iam.models.components.ComponentTypes;

public class RamComponent extends Component {

    private boolean isECCRegistered;

    @Override
    public ComponentTypes getType() {
        return ComponentTypes.RAM;
    }
}
