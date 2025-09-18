package com.unxwares.iam.models.components.cpu;

import com.unxwares.iam.models.components.Component;
import com.unxwares.iam.models.components.ComponentTypes;

public class CPUComponent extends Component {
    @Override
    public ComponentTypes getType() {
        return ComponentTypes.CPU;
    }
}
