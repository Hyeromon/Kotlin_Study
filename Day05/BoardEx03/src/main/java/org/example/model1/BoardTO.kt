package org.example.model1

import lombok.Getter
import lombok.Setter

@Getter
@Setter
class BoardTO {
    var seq: String? = null
    var subject: String? = null
    var writer: String? = null
    var mail: String? = null
    var password: String? = null
    var content: String? = null
    var hit: String? = null
    var wip: String? = null
    var wdate: String? = null
    var wgap: Int = 0
}
