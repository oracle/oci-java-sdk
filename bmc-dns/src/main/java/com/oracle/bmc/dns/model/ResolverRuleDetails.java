/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * A rule for a resolver. Specifying both qnameCoverConditions and clientAddressConditions is not
 * allowed.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "action",
        defaultImpl = ResolverRuleDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ResolverForwardRuleDetails.class,
            name = "FORWARD")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ResolverRuleDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"clientAddressConditions", "qnameCoverConditions"})
    protected ResolverRuleDetails(
            java.util.List<String> clientAddressConditions,
            java.util.List<String> qnameCoverConditions) {
        super();
        this.clientAddressConditions = clientAddressConditions;
        this.qnameCoverConditions = qnameCoverConditions;
    }

    /**
     * A list of CIDR blocks. The query must come from a client within one of the blocks in order
     * for the rule action to apply.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientAddressConditions")
    private final java.util.List<String> clientAddressConditions;

    /**
     * A list of CIDR blocks. The query must come from a client within one of the blocks in order
     * for the rule action to apply.
     *
     * @return the value
     */
    public java.util.List<String> getClientAddressConditions() {
        return clientAddressConditions;
    }

    /**
     * A list of domain names. The query must be covered by one of the domains in order for the rule
     * action to apply.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("qnameCoverConditions")
    private final java.util.List<String> qnameCoverConditions;

    /**
     * A list of domain names. The query must be covered by one of the domains in order for the rule
     * action to apply.
     *
     * @return the value
     */
    public java.util.List<String> getQnameCoverConditions() {
        return qnameCoverConditions;
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
        sb.append("ResolverRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clientAddressConditions=").append(String.valueOf(this.clientAddressConditions));
        sb.append(", qnameCoverConditions=").append(String.valueOf(this.qnameCoverConditions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResolverRuleDetails)) {
            return false;
        }

        ResolverRuleDetails other = (ResolverRuleDetails) o;
        return java.util.Objects.equals(this.clientAddressConditions, other.clientAddressConditions)
                && java.util.Objects.equals(this.qnameCoverConditions, other.qnameCoverConditions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clientAddressConditions == null
                                ? 43
                                : this.clientAddressConditions.hashCode());
        result =
                (result * PRIME)
                        + (this.qnameCoverConditions == null
                                ? 43
                                : this.qnameCoverConditions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The action determines the behavior of the rule. If a query matches a supplied condition, the
     * action will apply. If there are no conditions on the rule, all queries are subject to the
     * specified action. * {@code FORWARD} - Matching requests will be forwarded from the source
     * interface to the destination address.
     */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Forward("FORWARD"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
}
