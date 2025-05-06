/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Action Group details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = ActionGroupDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FleetBasedActionGroupDetails.class,
            name = "FLEET_USING_RUNBOOK")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ActionGroupDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "product",
        "lifecycleOperation",
        "activityId",
        "status",
        "timeStarted",
        "timeEnded"
    })
    protected ActionGroupDetails(
            String displayName,
            String product,
            String lifecycleOperation,
            String activityId,
            JobStatus status,
            java.util.Date timeStarted,
            java.util.Date timeEnded) {
        super();
        this.displayName = displayName;
        this.product = product;
        this.lifecycleOperation = lifecycleOperation;
        this.activityId = activityId;
        this.status = status;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
    }

    /** Name of the ActionGroup. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name of the ActionGroup.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Product associated. Only applicable if actionGroup type is PRODUCT. */
    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final String product;

    /**
     * Product associated. Only applicable if actionGroup type is PRODUCT.
     *
     * @return the value
     */
    public String getProduct() {
        return product;
    }

    /** LifeCycle Operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleOperation")
    private final String lifecycleOperation;

    /**
     * LifeCycle Operation.
     *
     * @return the value
     */
    public String getLifecycleOperation() {
        return lifecycleOperation;
    }

    /** Unique producer Id at Action Group Level */
    @com.fasterxml.jackson.annotation.JsonProperty("activityId")
    private final String activityId;

    /**
     * Unique producer Id at Action Group Level
     *
     * @return the value
     */
    public String getActivityId() {
        return activityId;
    }

    /** Status of the Job at Action Group Level. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final JobStatus status;

    /**
     * Status of the Job at Action Group Level.
     *
     * @return the value
     */
    public JobStatus getStatus() {
        return status;
    }

    /** The time the Scheduler Job started. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time the Scheduler Job started. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The time the Scheduler Job ended. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The time the Scheduler Job ended. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
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
        sb.append("ActionGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", lifecycleOperation=").append(String.valueOf(this.lifecycleOperation));
        sb.append(", activityId=").append(String.valueOf(this.activityId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionGroupDetails)) {
            return false;
        }

        ActionGroupDetails other = (ActionGroupDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.lifecycleOperation, other.lifecycleOperation)
                && java.util.Objects.equals(this.activityId, other.activityId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleOperation == null
                                ? 43
                                : this.lifecycleOperation.hashCode());
        result = (result * PRIME) + (this.activityId == null ? 43 : this.activityId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Action Group kind */
    public enum Kind implements com.oracle.bmc.http.internal.BmcEnum {
        FleetUsingRunbook("FLEET_USING_RUNBOOK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Kind.class);

        private final String value;
        private static java.util.Map<String, Kind> map;

        static {
            map = new java.util.HashMap<>();
            for (Kind v : Kind.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Kind(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Kind create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Kind', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
