/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A complex attribute that contains attributes representing the name
 *
 * <p>*SCIM++ Properties:** - idcsCsvAttributeNameMappings: [[columnHeaderName:Formatted Name,
 * mapsTo:name.formatted], [columnHeaderName:Honorific Prefix, mapsTo:name.honorificPrefix],
 * [columnHeaderName:First Name, mapsTo:name.givenName], [columnHeaderName:Middle Name,
 * mapsTo:name.middleName], [columnHeaderName:Last Name, mapsTo:name.familyName],
 * [columnHeaderName:Honorific Suffix, mapsTo:name.honorificSuffix]] - idcsPii: true - multiValued:
 * false - mutability: readWrite - required: true - returned: default - type: complex - uniqueness:
 * none <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserName.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UserName extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "formatted",
        "familyName",
        "givenName",
        "middleName",
        "honorificPrefix",
        "honorificSuffix"
    })
    public UserName(
            String formatted,
            String familyName,
            String givenName,
            String middleName,
            String honorificPrefix,
            String honorificSuffix) {
        super();
        this.formatted = formatted;
        this.familyName = familyName;
        this.givenName = givenName;
        this.middleName = middleName;
        this.honorificPrefix = honorificPrefix;
        this.honorificSuffix = honorificSuffix;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Full name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("formatted")
        private String formatted;

        /**
         * Full name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param formatted the value to set
         * @return this builder
         */
        public Builder formatted(String formatted) {
            this.formatted = formatted;
            this.__explicitlySet__.add("formatted");
            return this;
        }
        /**
         * Last name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Last Name -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("familyName")
        private String familyName;

        /**
         * Last name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Last Name -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: true -
         * returned: default - type: string - uniqueness: none
         *
         * @param familyName the value to set
         * @return this builder
         */
        public Builder familyName(String familyName) {
            this.familyName = familyName;
            this.__explicitlySet__.add("familyName");
            return this;
        }
        /**
         * First name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: First Name -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("givenName")
        private String givenName;

        /**
         * First name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: First Name -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         *
         * @param givenName the value to set
         * @return this builder
         */
        public Builder givenName(String givenName) {
            this.givenName = givenName;
            this.__explicitlySet__.add("givenName");
            return this;
        }
        /**
         * Middle name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Middle Name -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("middleName")
        private String middleName;

        /**
         * Middle name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Middle Name -
         * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
         *
         * @param middleName the value to set
         * @return this builder
         */
        public Builder middleName(String middleName) {
            this.middleName = middleName;
            this.__explicitlySet__.add("middleName");
            return this;
        }
        /**
         * Prefix
         *
         * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Honorific Prefix - idcsSearchable: false
         * - multiValued: false - mutability: readWrite - required: false - returned: default -
         * type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("honorificPrefix")
        private String honorificPrefix;

        /**
         * Prefix
         *
         * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Honorific Prefix - idcsSearchable: false
         * - multiValued: false - mutability: readWrite - required: false - returned: default -
         * type: string - uniqueness: none
         *
         * @param honorificPrefix the value to set
         * @return this builder
         */
        public Builder honorificPrefix(String honorificPrefix) {
            this.honorificPrefix = honorificPrefix;
            this.__explicitlySet__.add("honorificPrefix");
            return this;
        }
        /**
         * Suffix
         *
         * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Honorific Suffix - idcsSearchable: false
         * - multiValued: false - mutability: readWrite - required: false - returned: default -
         * type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("honorificSuffix")
        private String honorificSuffix;

        /**
         * Suffix
         *
         * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Honorific Suffix - idcsSearchable: false
         * - multiValued: false - mutability: readWrite - required: false - returned: default -
         * type: string - uniqueness: none
         *
         * @param honorificSuffix the value to set
         * @return this builder
         */
        public Builder honorificSuffix(String honorificSuffix) {
            this.honorificSuffix = honorificSuffix;
            this.__explicitlySet__.add("honorificSuffix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserName build() {
            UserName model =
                    new UserName(
                            this.formatted,
                            this.familyName,
                            this.givenName,
                            this.middleName,
                            this.honorificPrefix,
                            this.honorificSuffix);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserName model) {
            if (model.wasPropertyExplicitlySet("formatted")) {
                this.formatted(model.getFormatted());
            }
            if (model.wasPropertyExplicitlySet("familyName")) {
                this.familyName(model.getFamilyName());
            }
            if (model.wasPropertyExplicitlySet("givenName")) {
                this.givenName(model.getGivenName());
            }
            if (model.wasPropertyExplicitlySet("middleName")) {
                this.middleName(model.getMiddleName());
            }
            if (model.wasPropertyExplicitlySet("honorificPrefix")) {
                this.honorificPrefix(model.getHonorificPrefix());
            }
            if (model.wasPropertyExplicitlySet("honorificSuffix")) {
                this.honorificSuffix(model.getHonorificSuffix());
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
     * Full name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("formatted")
    private final String formatted;

    /**
     * Full name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getFormatted() {
        return formatted;
    }

    /**
     * Last name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Last Name -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("familyName")
    private final String familyName;

    /**
     * Last name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Last Name -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: true -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * First name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: First Name -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("givenName")
    private final String givenName;

    /**
     * First name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: First Name -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Middle name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Middle Name -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("middleName")
    private final String middleName;

    /**
     * Middle name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Middle Name -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Prefix
     *
     * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Honorific Prefix - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("honorificPrefix")
    private final String honorificPrefix;

    /**
     * Prefix
     *
     * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Honorific Prefix - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public String getHonorificPrefix() {
        return honorificPrefix;
    }

    /**
     * Suffix
     *
     * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Honorific Suffix - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("honorificSuffix")
    private final String honorificSuffix;

    /**
     * Suffix
     *
     * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Honorific Suffix - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public String getHonorificSuffix() {
        return honorificSuffix;
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
        sb.append("UserName(");
        sb.append("super=").append(super.toString());
        sb.append("formatted=").append(String.valueOf(this.formatted));
        sb.append(", familyName=").append(String.valueOf(this.familyName));
        sb.append(", givenName=").append(String.valueOf(this.givenName));
        sb.append(", middleName=").append(String.valueOf(this.middleName));
        sb.append(", honorificPrefix=").append(String.valueOf(this.honorificPrefix));
        sb.append(", honorificSuffix=").append(String.valueOf(this.honorificSuffix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserName)) {
            return false;
        }

        UserName other = (UserName) o;
        return java.util.Objects.equals(this.formatted, other.formatted)
                && java.util.Objects.equals(this.familyName, other.familyName)
                && java.util.Objects.equals(this.givenName, other.givenName)
                && java.util.Objects.equals(this.middleName, other.middleName)
                && java.util.Objects.equals(this.honorificPrefix, other.honorificPrefix)
                && java.util.Objects.equals(this.honorificSuffix, other.honorificSuffix)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.formatted == null ? 43 : this.formatted.hashCode());
        result = (result * PRIME) + (this.familyName == null ? 43 : this.familyName.hashCode());
        result = (result * PRIME) + (this.givenName == null ? 43 : this.givenName.hashCode());
        result = (result * PRIME) + (this.middleName == null ? 43 : this.middleName.hashCode());
        result =
                (result * PRIME)
                        + (this.honorificPrefix == null ? 43 : this.honorificPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.honorificSuffix == null ? 43 : this.honorificSuffix.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
