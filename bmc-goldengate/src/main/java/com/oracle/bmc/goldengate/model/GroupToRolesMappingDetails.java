/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Defines the IDP Groups to GoldenGate roles mapping. This field is used only for IAM deployment
 * and does not have any impact on non-IAM deployments. For IAM deployment, when user does not
 * specify this mapping, then it has null value and default mapping is used. User belonging to each
 * group can only perform the actions according to the role the respective group is mapped to. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GroupToRolesMappingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GroupToRolesMappingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "securityGroupId",
        "administratorGroupId",
        "operatorGroupId",
        "userGroupId"
    })
    public GroupToRolesMappingDetails(
            String securityGroupId,
            String administratorGroupId,
            String operatorGroupId,
            String userGroupId) {
        super();
        this.securityGroupId = securityGroupId;
        this.administratorGroupId = administratorGroupId;
        this.operatorGroupId = operatorGroupId;
        this.userGroupId = userGroupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * IDP group which will be mapped to goldengate role securityGroup. It grants administration
         * of security related objects and invoke security related service requests. This role has
         * full privileges.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityGroupId")
        private String securityGroupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * IDP group which will be mapped to goldengate role securityGroup. It grants administration
         * of security related objects and invoke security related service requests. This role has
         * full privileges.
         *
         * @param securityGroupId the value to set
         * @return this builder
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            this.__explicitlySet__.add("securityGroupId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * IDP group which will be mapped to goldengate role administratorGroup. It grants full
         * access to the user, including the ability to alter general, non-security related
         * operational parameters and profiles of the server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("administratorGroupId")
        private String administratorGroupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * IDP group which will be mapped to goldengate role administratorGroup. It grants full
         * access to the user, including the ability to alter general, non-security related
         * operational parameters and profiles of the server.
         *
         * @param administratorGroupId the value to set
         * @return this builder
         */
        public Builder administratorGroupId(String administratorGroupId) {
            this.administratorGroupId = administratorGroupId;
            this.__explicitlySet__.add("administratorGroupId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * IDP group which will be mapped to goldengate role operatorGroup. It allows users to
         * perform only operational actions, like starting and stopping resources. Operators cannot
         * alter the operational parameters or profiles of the MA server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operatorGroupId")
        private String operatorGroupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * IDP group which will be mapped to goldengate role operatorGroup. It allows users to
         * perform only operational actions, like starting and stopping resources. Operators cannot
         * alter the operational parameters or profiles of the MA server.
         *
         * @param operatorGroupId the value to set
         * @return this builder
         */
        public Builder operatorGroupId(String operatorGroupId) {
            this.operatorGroupId = operatorGroupId;
            this.__explicitlySet__.add("operatorGroupId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * IDP group which will be mapped to goldengate role userGroup. It allows information-only
         * service requests, which do not alter or affect the operation of either the MA. Examples
         * of query and read-only information include performance metric information and resource
         * status and monitoring information
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userGroupId")
        private String userGroupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * IDP group which will be mapped to goldengate role userGroup. It allows information-only
         * service requests, which do not alter or affect the operation of either the MA. Examples
         * of query and read-only information include performance metric information and resource
         * status and monitoring information
         *
         * @param userGroupId the value to set
         * @return this builder
         */
        public Builder userGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            this.__explicitlySet__.add("userGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GroupToRolesMappingDetails build() {
            GroupToRolesMappingDetails model =
                    new GroupToRolesMappingDetails(
                            this.securityGroupId,
                            this.administratorGroupId,
                            this.operatorGroupId,
                            this.userGroupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GroupToRolesMappingDetails model) {
            if (model.wasPropertyExplicitlySet("securityGroupId")) {
                this.securityGroupId(model.getSecurityGroupId());
            }
            if (model.wasPropertyExplicitlySet("administratorGroupId")) {
                this.administratorGroupId(model.getAdministratorGroupId());
            }
            if (model.wasPropertyExplicitlySet("operatorGroupId")) {
                this.operatorGroupId(model.getOperatorGroupId());
            }
            if (model.wasPropertyExplicitlySet("userGroupId")) {
                this.userGroupId(model.getUserGroupId());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the IDP
     * group which will be mapped to goldengate role securityGroup. It grants administration of
     * security related objects and invoke security related service requests. This role has full
     * privileges.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityGroupId")
    private final String securityGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the IDP
     * group which will be mapped to goldengate role securityGroup. It grants administration of
     * security related objects and invoke security related service requests. This role has full
     * privileges.
     *
     * @return the value
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the IDP
     * group which will be mapped to goldengate role administratorGroup. It grants full access to
     * the user, including the ability to alter general, non-security related operational parameters
     * and profiles of the server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("administratorGroupId")
    private final String administratorGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the IDP
     * group which will be mapped to goldengate role administratorGroup. It grants full access to
     * the user, including the ability to alter general, non-security related operational parameters
     * and profiles of the server.
     *
     * @return the value
     */
    public String getAdministratorGroupId() {
        return administratorGroupId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the IDP
     * group which will be mapped to goldengate role operatorGroup. It allows users to perform only
     * operational actions, like starting and stopping resources. Operators cannot alter the
     * operational parameters or profiles of the MA server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operatorGroupId")
    private final String operatorGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the IDP
     * group which will be mapped to goldengate role operatorGroup. It allows users to perform only
     * operational actions, like starting and stopping resources. Operators cannot alter the
     * operational parameters or profiles of the MA server.
     *
     * @return the value
     */
    public String getOperatorGroupId() {
        return operatorGroupId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the IDP
     * group which will be mapped to goldengate role userGroup. It allows information-only service
     * requests, which do not alter or affect the operation of either the MA. Examples of query and
     * read-only information include performance metric information and resource status and
     * monitoring information
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userGroupId")
    private final String userGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the IDP
     * group which will be mapped to goldengate role userGroup. It allows information-only service
     * requests, which do not alter or affect the operation of either the MA. Examples of query and
     * read-only information include performance metric information and resource status and
     * monitoring information
     *
     * @return the value
     */
    public String getUserGroupId() {
        return userGroupId;
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
        sb.append("GroupToRolesMappingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("securityGroupId=").append(String.valueOf(this.securityGroupId));
        sb.append(", administratorGroupId=").append(String.valueOf(this.administratorGroupId));
        sb.append(", operatorGroupId=").append(String.valueOf(this.operatorGroupId));
        sb.append(", userGroupId=").append(String.valueOf(this.userGroupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupToRolesMappingDetails)) {
            return false;
        }

        GroupToRolesMappingDetails other = (GroupToRolesMappingDetails) o;
        return java.util.Objects.equals(this.securityGroupId, other.securityGroupId)
                && java.util.Objects.equals(this.administratorGroupId, other.administratorGroupId)
                && java.util.Objects.equals(this.operatorGroupId, other.operatorGroupId)
                && java.util.Objects.equals(this.userGroupId, other.userGroupId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.securityGroupId == null ? 43 : this.securityGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.administratorGroupId == null
                                ? 43
                                : this.administratorGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.operatorGroupId == null ? 43 : this.operatorGroupId.hashCode());
        result = (result * PRIME) + (this.userGroupId == null ? 43 : this.userGroupId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
