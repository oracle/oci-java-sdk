/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateCpeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateCpeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "freeformTags",
        "cpeDeviceShapeId"
    })
    public UpdateCpeDetails(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String cpeDeviceShapeId) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.cpeDeviceShapeId = cpeDeviceShapeId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * CPE device type. You can provide a value if you want to generate CPE device configuration
         * content for IPSec connections that use this CPE. For a list of possible values, see
         * {@link #listCpeDeviceShapes(ListCpeDeviceShapesRequest) listCpeDeviceShapes}.
         *
         * <p>For more information about generating CPE device configuration content, see:
         *
         * <p>{@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest)
         * getCpeDeviceConfigContent} * {@link
         * #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest)
         * getIpsecCpeDeviceConfigContent} * {@link
         * #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
         * getTunnelCpeDeviceConfigContent} * {@link
         * #getTunnelCpeDeviceConfig(GetTunnelCpeDeviceConfigRequest) getTunnelCpeDeviceConfig}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpeDeviceShapeId")
        private String cpeDeviceShapeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * CPE device type. You can provide a value if you want to generate CPE device configuration
         * content for IPSec connections that use this CPE. For a list of possible values, see
         * {@link #listCpeDeviceShapes(ListCpeDeviceShapesRequest) listCpeDeviceShapes}.
         *
         * <p>For more information about generating CPE device configuration content, see:
         *
         * <p>{@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest)
         * getCpeDeviceConfigContent} * {@link
         * #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest)
         * getIpsecCpeDeviceConfigContent} * {@link
         * #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
         * getTunnelCpeDeviceConfigContent} * {@link
         * #getTunnelCpeDeviceConfig(GetTunnelCpeDeviceConfigRequest) getTunnelCpeDeviceConfig}
         *
         * @param cpeDeviceShapeId the value to set
         * @return this builder
         */
        public Builder cpeDeviceShapeId(String cpeDeviceShapeId) {
            this.cpeDeviceShapeId = cpeDeviceShapeId;
            this.__explicitlySet__.add("cpeDeviceShapeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCpeDetails build() {
            UpdateCpeDetails model =
                    new UpdateCpeDetails(
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.cpeDeviceShapeId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCpeDetails model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("cpeDeviceShapeId")) {
                this.cpeDeviceShapeId(model.getCpeDeviceShapeId());
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the CPE
     * device type. You can provide a value if you want to generate CPE device configuration content
     * for IPSec connections that use this CPE. For a list of possible values, see {@link
     * #listCpeDeviceShapes(ListCpeDeviceShapesRequest) listCpeDeviceShapes}.
     *
     * <p>For more information about generating CPE device configuration content, see:
     *
     * <p>{@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest)
     * getCpeDeviceConfigContent} * {@link
     * #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest)
     * getIpsecCpeDeviceConfigContent} * {@link
     * #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
     * getTunnelCpeDeviceConfigContent} * {@link
     * #getTunnelCpeDeviceConfig(GetTunnelCpeDeviceConfigRequest) getTunnelCpeDeviceConfig}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpeDeviceShapeId")
    private final String cpeDeviceShapeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the CPE
     * device type. You can provide a value if you want to generate CPE device configuration content
     * for IPSec connections that use this CPE. For a list of possible values, see {@link
     * #listCpeDeviceShapes(ListCpeDeviceShapesRequest) listCpeDeviceShapes}.
     *
     * <p>For more information about generating CPE device configuration content, see:
     *
     * <p>{@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest)
     * getCpeDeviceConfigContent} * {@link
     * #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest)
     * getIpsecCpeDeviceConfigContent} * {@link
     * #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
     * getTunnelCpeDeviceConfigContent} * {@link
     * #getTunnelCpeDeviceConfig(GetTunnelCpeDeviceConfigRequest) getTunnelCpeDeviceConfig}
     *
     * @return the value
     */
    public String getCpeDeviceShapeId() {
        return cpeDeviceShapeId;
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
        sb.append("UpdateCpeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", cpeDeviceShapeId=").append(String.valueOf(this.cpeDeviceShapeId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCpeDetails)) {
            return false;
        }

        UpdateCpeDetails other = (UpdateCpeDetails) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.cpeDeviceShapeId, other.cpeDeviceShapeId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.cpeDeviceShapeId == null ? 43 : this.cpeDeviceShapeId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
