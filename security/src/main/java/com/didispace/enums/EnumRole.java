/**
* 
* @author Mity1299
*/
package com.didispace.enums;

/**
 * @author Mity1299
 *
 */
public enum EnumRole {
    
    ADMIN("管理员"),
    NORMAL("普通用户"),
    ORGANIZER("管理员");
    
    
    final String description;
    
    EnumRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    

}
