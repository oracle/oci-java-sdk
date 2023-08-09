/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Description:
 *
 * <p>*Added In:** 19.2.1
 *
 * <p>*SCIM++ Properties:** - idcsCompositeKey: [value, idcsAppRoleId] - idcsSearchable: true -
 * multiValued: true - mutability: readOnly - required: false - returned: request - type: complex
 * <br>
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
        builder = UserExtIdcsAppRolesLimitedToGroups.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UserExtIdcsAppRolesLimitedToGroups
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"idcsAppRoleId", "value", "ref", "display", "ocid"})
    public UserExtIdcsAppRolesLimitedToGroups(
            String idcsAppRoleId, String value, String ref, String display, String ocid) {
        super();
        this.idcsAppRoleId = idcsAppRoleId;
        this.value = value;
        this.ref = ref;
        this.display = display;
        this.ocid = ocid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The id of the Oracle Identity Cloud Service AppRole grant limited to one or more Groups.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsCsvAttributeName: IDCS AppRole Name - idcsSearchable: true
         * - multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppRoleId")
        private String idcsAppRoleId;

        /**
         * The id of the Oracle Identity Cloud Service AppRole grant limited to one or more Groups.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsCsvAttributeName: IDCS AppRole Name - idcsSearchable: true
         * - multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * string - uniqueness: none
         *
         * @param idcsAppRoleId the value to set
         * @return this builder
         */
        public Builder idcsAppRoleId(String idcsAppRoleId) {
            this.idcsAppRoleId = idcsAppRoleId;
            this.__explicitlySet__.add("idcsAppRoleId");
            return this;
        }
        /**
         * The id of a Group the AppRole Grant is limited to
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Group Name - idcsSearchable: true -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The id of a Group the AppRole Grant is limited to
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Group Name - idcsSearchable: true -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * string - uniqueness: none
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The URI of the SCIM resource representing the Group manager. RECOMMENDED.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * The URI of the SCIM resource representing the Group manager. RECOMMENDED.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         *
         * @param ref the value to set
         * @return this builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * Group display name
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private String display;

        /**
         * Group display name
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param display the value to set
         * @return this builder
         */
        public Builder display(String display) {
            this.display = display;
            this.__explicitlySet__.add("display");
            return this;
        }
        /**
         * The ocid of a Group the AppRole Grant is limited to
         *
         * <p>*Added In:** 2202230830
         *
         * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Group Ocid - idcsSearchable: true -
         * multiValued: false - mutability: readWrite - required: false - returned: default - type:
         * string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocid")
        private String ocid;

        /**
         * The ocid of a Group the AppRole Grant is limited to
         *
         * <p>*Added In:** 2202230830
         *
         * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Group Ocid - idcsSearchable: true -
         * multiValued: false - mutability: readWrite - required: false - returned: default - type:
         * string - uniqueness: none
         *
         * @param ocid the value to set
         * @return this builder
         */
        public Builder ocid(String ocid) {
            this.ocid = ocid;
            this.__explicitlySet__.add("ocid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserExtIdcsAppRolesLimitedToGroups build() {
            UserExtIdcsAppRolesLimitedToGroups model =
                    new UserExtIdcsAppRolesLimitedToGroups(
                            this.idcsAppRoleId, this.value, this.ref, this.display, this.ocid);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserExtIdcsAppRolesLimitedToGroups model) {
            if (model.wasPropertyExplicitlySet("idcsAppRoleId")) {
                this.idcsAppRoleId(model.getIdcsAppRoleId());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
            }
            if (model.wasPropertyExplicitlySet("ocid")) {
                this.ocid(model.getOcid());
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
     * The id of the Oracle Identity Cloud Service AppRole grant limited to one or more Groups.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsCsvAttributeName: IDCS AppRole Name - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppRoleId")
    private final String idcsAppRoleId;

    /**
     * The id of the Oracle Identity Cloud Service AppRole grant limited to one or more Groups.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsCsvAttributeName: IDCS AppRole Name - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsAppRoleId() {
        return idcsAppRoleId;
    }

    /**
     * The id of a Group the AppRole Grant is limited to
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Group Name - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The id of a Group the AppRole Grant is limited to
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Group Name - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * The URI of the SCIM resource representing the Group manager. RECOMMENDED.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * The URI of the SCIM resource representing the Group manager. RECOMMENDED.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     *
     * @return the value
     */
    public String getRef() {
        return ref;
    }

    /**
     * Group display name
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final String display;

    /**
     * Group display name
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDisplay() {
        return display;
    }

    /**
     * The ocid of a Group the AppRole Grant is limited to
     *
     * <p>*Added In:** 2202230830
     *
     * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Group Ocid - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocid")
    private final String ocid;

    /**
     * The ocid of a Group the AppRole Grant is limited to
     *
     * <p>*Added In:** 2202230830
     *
     * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Group Ocid - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public String getOcid() {
        return ocid;
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
        sb.append("UserExtIdcsAppRolesLimitedToGroups(");
        sb.append("super=").append(super.toString());
        sb.append("idcsAppRoleId=").append(String.valueOf(this.idcsAppRoleId));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", ocid=").append(String.valueOf(this.ocid));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserExtIdcsAppRolesLimitedToGroups)) {
            return false;
        }

        UserExtIdcsAppRolesLimitedToGroups other = (UserExtIdcsAppRolesLimitedToGroups) o;
        return java.util.Objects.equals(this.idcsAppRoleId, other.idcsAppRoleId)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.idcsAppRoleId == null ? 43 : this.idcsAppRoleId.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
