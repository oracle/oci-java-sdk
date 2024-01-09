/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Enterprise User <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExtensionEnterprise20User.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionEnterprise20User
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "employeeNumber",
        "costCenter",
        "organization",
        "division",
        "department",
        "manager"
    })
    public ExtensionEnterprise20User(
            String employeeNumber,
            String costCenter,
            String organization,
            String division,
            String department,
            UserExtManager manager) {
        super();
        this.employeeNumber = employeeNumber;
        this.costCenter = costCenter;
        this.organization = organization;
        this.division = division;
        this.department = department;
        this.manager = manager;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Numeric or alphanumeric identifier assigned to a person, typically based on order of hire
         * or association with an organization.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Employee Number -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Employee Number]] - idcsPii: true -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("employeeNumber")
        private String employeeNumber;

        /**
         * Numeric or alphanumeric identifier assigned to a person, typically based on order of hire
         * or association with an organization.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Employee Number -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Employee Number]] - idcsPii: true -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         *
         * @param employeeNumber the value to set
         * @return this builder
         */
        public Builder employeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            this.__explicitlySet__.add("employeeNumber");
            return this;
        }
        /**
         * Identifies the name of a cost center.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Cost Center -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Cost Center]] - idcsPii: true -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("costCenter")
        private String costCenter;

        /**
         * Identifies the name of a cost center.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Cost Center -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Cost Center]] - idcsPii: true -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         *
         * @param costCenter the value to set
         * @return this builder
         */
        public Builder costCenter(String costCenter) {
            this.costCenter = costCenter;
            this.__explicitlySet__.add("costCenter");
            return this;
        }
        /**
         * Identifies the name of an organization.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Organization -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Organization Name,
         * deprecatedColumnHeaderName:Organization]] - idcsPii: true - idcsSearchable: true -
         * multiValued: false - mutability: readWrite - required: false - returned: default - type:
         * string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("organization")
        private String organization;

        /**
         * Identifies the name of an organization.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Organization -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Organization Name,
         * deprecatedColumnHeaderName:Organization]] - idcsPii: true - idcsSearchable: true -
         * multiValued: false - mutability: readWrite - required: false - returned: default - type:
         * string - uniqueness: none
         *
         * @param organization the value to set
         * @return this builder
         */
        public Builder organization(String organization) {
            this.organization = organization;
            this.__explicitlySet__.add("organization");
            return this;
        }
        /**
         * Identifies the name of a division.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Division -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Division]] - idcsPii: true -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("division")
        private String division;

        /**
         * Identifies the name of a division.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Division -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Division]] - idcsPii: true -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         *
         * @param division the value to set
         * @return this builder
         */
        public Builder division(String division) {
            this.division = division;
            this.__explicitlySet__.add("division");
            return this;
        }
        /**
         * Identifies the name of a department.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Department -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Department]] - idcsPii: true -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("department")
        private String department;

        /**
         * Identifies the name of a department.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Department -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Department]] - idcsPii: true -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         *
         * @param department the value to set
         * @return this builder
         */
        public Builder department(String department) {
            this.department = department;
            this.__explicitlySet__.add("department");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("manager")
        private UserExtManager manager;

        public Builder manager(UserExtManager manager) {
            this.manager = manager;
            this.__explicitlySet__.add("manager");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionEnterprise20User build() {
            ExtensionEnterprise20User model =
                    new ExtensionEnterprise20User(
                            this.employeeNumber,
                            this.costCenter,
                            this.organization,
                            this.division,
                            this.department,
                            this.manager);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionEnterprise20User model) {
            if (model.wasPropertyExplicitlySet("employeeNumber")) {
                this.employeeNumber(model.getEmployeeNumber());
            }
            if (model.wasPropertyExplicitlySet("costCenter")) {
                this.costCenter(model.getCostCenter());
            }
            if (model.wasPropertyExplicitlySet("organization")) {
                this.organization(model.getOrganization());
            }
            if (model.wasPropertyExplicitlySet("division")) {
                this.division(model.getDivision());
            }
            if (model.wasPropertyExplicitlySet("department")) {
                this.department(model.getDepartment());
            }
            if (model.wasPropertyExplicitlySet("manager")) {
                this.manager(model.getManager());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Numeric or alphanumeric identifier assigned to a person, typically based on order of hire or
     * association with an organization.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Employee Number -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Employee Number]] - idcsPii: true -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("employeeNumber")
    private final String employeeNumber;

    /**
     * Numeric or alphanumeric identifier assigned to a person, typically based on order of hire or
     * association with an organization.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Employee Number -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Employee Number]] - idcsPii: true -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Identifies the name of a cost center.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Cost Center -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Cost Center]] - idcsPii: true -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("costCenter")
    private final String costCenter;

    /**
     * Identifies the name of a cost center.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Cost Center -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Cost Center]] - idcsPii: true -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Identifies the name of an organization.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Organization -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Organization Name,
     * deprecatedColumnHeaderName:Organization]] - idcsPii: true - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    private final String organization;

    /**
     * Identifies the name of an organization.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Organization -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Organization Name,
     * deprecatedColumnHeaderName:Organization]] - idcsPii: true - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Identifies the name of a division.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Division -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Division]] - idcsPii: true - idcsSearchable:
     * true - multiValued: false - mutability: readWrite - required: false - returned: default -
     * type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("division")
    private final String division;

    /**
     * Identifies the name of a division.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Division -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Division]] - idcsPii: true - idcsSearchable:
     * true - multiValued: false - mutability: readWrite - required: false - returned: default -
     * type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDivision() {
        return division;
    }

    /**
     * Identifies the name of a department.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Department -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Department]] - idcsPii: true -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("department")
    private final String department;

    /**
     * Identifies the name of a department.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Department -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Department]] - idcsPii: true -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDepartment() {
        return department;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("manager")
    private final UserExtManager manager;

    public UserExtManager getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExtensionEnterprise20User(");
        sb.append("super=").append(super.toString());
        sb.append("employeeNumber=").append(String.valueOf(this.employeeNumber));
        sb.append(", costCenter=").append(String.valueOf(this.costCenter));
        sb.append(", organization=").append(String.valueOf(this.organization));
        sb.append(", division=").append(String.valueOf(this.division));
        sb.append(", department=").append(String.valueOf(this.department));
        sb.append(", manager=").append(String.valueOf(this.manager));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionEnterprise20User)) {
            return false;
        }

        ExtensionEnterprise20User other = (ExtensionEnterprise20User) o;
        return java.util.Objects.equals(this.employeeNumber, other.employeeNumber)
                && java.util.Objects.equals(this.costCenter, other.costCenter)
                && java.util.Objects.equals(this.organization, other.organization)
                && java.util.Objects.equals(this.division, other.division)
                && java.util.Objects.equals(this.department, other.department)
                && java.util.Objects.equals(this.manager, other.manager)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.employeeNumber == null ? 43 : this.employeeNumber.hashCode());
        result = (result * PRIME) + (this.costCenter == null ? 43 : this.costCenter.hashCode());
        result = (result * PRIME) + (this.organization == null ? 43 : this.organization.hashCode());
        result = (result * PRIME) + (this.division == null ? 43 : this.division.hashCode());
        result = (result * PRIME) + (this.department == null ? 43 : this.department.hashCode());
        result = (result * PRIME) + (this.manager == null ? 43 : this.manager.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
