package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.order.OrderID;
import com.oanda.v20.order.OrderTriggerCondition;
import com.oanda.v20.order.TimeInForce;
import com.oanda.v20.pricing.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.trade.TradeID;

/**
 * A StopLossOrderRejectTransaction represents the rejection of the creation of
 * a StopLoss Order.
 * <p>
 * Reject Stop Loss Order ({reason}): Close Trade {tradeID} @ {price}
 */
public class StopLossOrderRejectTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public StopLossOrderRejectTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the StopLossOrderRejectTransaction to copy
     */
    public StopLossOrderRejectTransaction(StopLossOrderRejectTransaction other) {
        this.id = other.id;
        this.time = other.time;
        if (other.userID != null)
        {
            this.userID = new Integer(other.userID);
        }
        this.accountID = other.accountID;
        this.batchID = other.batchID;
        this.requestID = other.requestID;
        this.type = other.type;
        this.tradeID = other.tradeID;
        this.clientTradeID = other.clientTradeID;
        this.price = other.price;
        this.timeInForce = other.timeInForce;
        this.gtdTime = other.gtdTime;
        this.triggerCondition = other.triggerCondition;
        this.reason = other.reason;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
        this.orderFillTransactionID = other.orderFillTransactionID;
        this.intendedReplacesOrderID = other.intendedReplacesOrderID;
        this.rejectReason = other.rejectReason;
    }

    @SerializedName("id") private TransactionID id;

    /**
     * Get the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @return the Transaction ID
     * @see TransactionID
     */
    public TransactionID getId() {
        return this.id;
    }

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a TransactionID
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TransactionID
     */
    public StopLossOrderRejectTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TransactionID
     */
    public StopLossOrderRejectTransaction setId(String id) {
        this.id = new TransactionID(id);
        return this;
    }

    @SerializedName("time") private DateTime time;

    /**
     * Get the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @return the Time
     * @see DateTime
     */
    public DateTime getTime() {
        return this.time;
    }

    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a DateTime
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see DateTime
     */
    public StopLossOrderRejectTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see DateTime
     */
    public StopLossOrderRejectTransaction setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    @SerializedName("userID") private Integer userID;

    /**
     * Get the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @return the User ID
     */
    public Integer getUserID() {
        return this.userID;
    }

    /**
     * Set the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @param userID the User ID as an Integer
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     */
    public StopLossOrderRejectTransaction setUserID(Integer userID) {
        this.userID = userID;
        return this;
    }

    @SerializedName("accountID") private AccountID accountID;

    /**
     * Get the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @return the Account ID
     * @see AccountID
     */
    public AccountID getAccountID() {
        return this.accountID;
    }

    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as an AccountID
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see AccountID
     */
    public StopLossOrderRejectTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see AccountID
     */
    public StopLossOrderRejectTransaction setAccountID(String accountID) {
        this.accountID = new AccountID(accountID);
        return this;
    }

    @SerializedName("batchID") private TransactionID batchID;

    /**
     * Get the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @return the Transaction Batch ID
     * @see TransactionID
     */
    public TransactionID getBatchID() {
        return this.batchID;
    }

    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID as a TransactionID
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TransactionID
     */
    public StopLossOrderRejectTransaction setBatchID(TransactionID batchID) {
        this.batchID = batchID;
        return this;
    }
    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID as a String
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TransactionID
     */
    public StopLossOrderRejectTransaction setBatchID(String batchID) {
        this.batchID = new TransactionID(batchID);
        return this;
    }

    @SerializedName("requestID") private RequestID requestID;

    /**
     * Get the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @return the Request ID
     * @see RequestID
     */
    public RequestID getRequestID() {
        return this.requestID;
    }

    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a RequestID
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see RequestID
     */
    public StopLossOrderRejectTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see RequestID
     */
    public StopLossOrderRejectTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.STOP_LOSS_ORDER_REJECT;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "STOP_LOSS_ORDER_REJECT" in a
     * StopLossOrderRejectTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    /**
     * Set the Type
     * <p>
     * The Type of the Transaction. Always set to "STOP_LOSS_ORDER_REJECT" in a
     * StopLossOrderRejectTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TransactionType
     */
    public StopLossOrderRejectTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public TradeID getTradeID() {
        return this.tradeID;
    }

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID as a TradeID
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TradeID
     */
    public StopLossOrderRejectTransaction setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TradeID
     */
    public StopLossOrderRejectTransaction setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    @SerializedName("clientTradeID") private ClientID clientTradeID;

    /**
     * Get the Client Trade ID
     * <p>
     * The client ID of the Trade to be closed when the price threshold is
     * breached.
     * <p>
     * @return the Client Trade ID
     * @see ClientID
     */
    public ClientID getClientTradeID() {
        return this.clientTradeID;
    }

    /**
     * Set the Client Trade ID
     * <p>
     * The client ID of the Trade to be closed when the price threshold is
     * breached.
     * <p>
     * @param clientTradeID the Client Trade ID as a ClientID
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see ClientID
     */
    public StopLossOrderRejectTransaction setClientTradeID(ClientID clientTradeID) {
        this.clientTradeID = clientTradeID;
        return this;
    }
    /**
     * Set the Client Trade ID
     * <p>
     * The client ID of the Trade to be closed when the price threshold is
     * breached.
     * <p>
     * @param clientTradeID the Client Trade ID as a String
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see ClientID
     */
    public StopLossOrderRejectTransaction setClientTradeID(String clientTradeID) {
        this.clientTradeID = new ClientID(clientTradeID);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Price
     * <p>
     * The price threshold specified for the StopLoss Order. The associated
     * Trade will be closed by a market price that is equal to or worse than
     * this threshold.
     * <p>
     * @return the Price
     * @see PriceValue
     */
    public PriceValue getPrice() {
        return this.price;
    }

    /**
     * Set the Price
     * <p>
     * The price threshold specified for the StopLoss Order. The associated
     * Trade will be closed by a market price that is equal to or worse than
     * this threshold.
     * <p>
     * @param price the Price as a PriceValue
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see PriceValue
     */
    public StopLossOrderRejectTransaction setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the StopLoss Order. The associated
     * Trade will be closed by a market price that is equal to or worse than
     * this threshold.
     * <p>
     * @param price the Price as a String
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see PriceValue
     */
    public StopLossOrderRejectTransaction setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the StopLoss Order. The associated
     * Trade will be closed by a market price that is equal to or worse than
     * this threshold.
     * <p>
     * @param price the Price as a double
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see PriceValue
     */
    public StopLossOrderRejectTransaction setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the StopLoss Order. The associated
     * Trade will be closed by a market price that is equal to or worse than
     * this threshold.
     * <p>
     * @param price the Price as a BigDecimal
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see PriceValue
     */
    public StopLossOrderRejectTransaction setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Get the Time In Force
     * <p>
     * The time-in-force requested for the StopLoss Order. Restricted to "GTC",
     * "GFD" and "GTD" for StopLoss Orders.
     * <p>
     * @return the Time In Force
     * @see TimeInForce
     */
    public TimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /**
     * Set the Time In Force
     * <p>
     * The time-in-force requested for the StopLoss Order. Restricted to "GTC",
     * "GFD" and "GTD" for StopLoss Orders.
     * <p>
     * @param timeInForce the Time In Force as a TimeInForce
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TimeInForce
     */
    public StopLossOrderRejectTransaction setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Get the GTD Time
     * <p>
     * The date/time when the StopLoss Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @return the GTD Time
     * @see DateTime
     */
    public DateTime getGtdTime() {
        return this.gtdTime;
    }

    /**
     * Set the GTD Time
     * <p>
     * The date/time when the StopLoss Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time as a DateTime
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see DateTime
     */
    public StopLossOrderRejectTransaction setGtdTime(DateTime gtdTime) {
        this.gtdTime = gtdTime;
        return this;
    }
    /**
     * Set the GTD Time
     * <p>
     * The date/time when the StopLoss Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time as a String
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see DateTime
     */
    public StopLossOrderRejectTransaction setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    @SerializedName("triggerCondition") private OrderTriggerCondition triggerCondition = OrderTriggerCondition.DEFAULT;

    /**
     * Get the Trigger Condition
     * <p>
     * Specification of what component of a price should be used for comparison
     * when determining if the Order should be filled.
     * <p>
     * @return the Trigger Condition
     * @see OrderTriggerCondition
     */
    public OrderTriggerCondition getTriggerCondition() {
        return this.triggerCondition;
    }

    /**
     * Set the Trigger Condition
     * <p>
     * Specification of what component of a price should be used for comparison
     * when determining if the Order should be filled.
     * <p>
     * @param triggerCondition the Trigger Condition as an
     * OrderTriggerCondition
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see OrderTriggerCondition
     */
    public StopLossOrderRejectTransaction setTriggerCondition(OrderTriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }

    @SerializedName("reason") private StopLossOrderReason reason;

    /**
     * Get the Reason
     * <p>
     * The reason that the Stop Loss Order was initiated
     * <p>
     * @return the Reason
     * @see StopLossOrderReason
     */
    public StopLossOrderReason getReason() {
        return this.reason;
    }

    /**
     * Set the Reason
     * <p>
     * The reason that the Stop Loss Order was initiated
     * <p>
     * @param reason the Reason as a StopLossOrderReason
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see StopLossOrderReason
     */
    public StopLossOrderRejectTransaction setReason(StopLossOrderReason reason) {
        this.reason = reason;
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Get the Order Client Extensions
     * <p>
     * Client Extensions to add to the Order (only provided if the Order is
     * being created with client extensions).
     * <p>
     * @return the Order Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions() {
        return this.clientExtensions;
    }

    /**
     * Set the Order Client Extensions
     * <p>
     * Client Extensions to add to the Order (only provided if the Order is
     * being created with client extensions).
     * <p>
     * @param clientExtensions the Order Client Extensions as a
     * ClientExtensions
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see ClientExtensions
     */
    public StopLossOrderRejectTransaction setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @SerializedName("orderFillTransactionID") private TransactionID orderFillTransactionID;

    /**
     * Get the Order Fill Transaction ID
     * <p>
     * The ID of the OrderFill Transaction that caused this Order to be created
     * (only provided if this Order was created automatically when another
     * Order was filled).
     * <p>
     * @return the Order Fill Transaction ID
     * @see TransactionID
     */
    public TransactionID getOrderFillTransactionID() {
        return this.orderFillTransactionID;
    }

    /**
     * Set the Order Fill Transaction ID
     * <p>
     * The ID of the OrderFill Transaction that caused this Order to be created
     * (only provided if this Order was created automatically when another
     * Order was filled).
     * <p>
     * @param orderFillTransactionID the Order Fill Transaction ID as a
     * TransactionID
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TransactionID
     */
    public StopLossOrderRejectTransaction setOrderFillTransactionID(TransactionID orderFillTransactionID) {
        this.orderFillTransactionID = orderFillTransactionID;
        return this;
    }
    /**
     * Set the Order Fill Transaction ID
     * <p>
     * The ID of the OrderFill Transaction that caused this Order to be created
     * (only provided if this Order was created automatically when another
     * Order was filled).
     * <p>
     * @param orderFillTransactionID the Order Fill Transaction ID as a String
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TransactionID
     */
    public StopLossOrderRejectTransaction setOrderFillTransactionID(String orderFillTransactionID) {
        this.orderFillTransactionID = new TransactionID(orderFillTransactionID);
        return this;
    }

    @SerializedName("intendedReplacesOrderID") private OrderID intendedReplacesOrderID;

    /**
     * Get the Order ID to Replace
     * <p>
     * The ID of the Order that this Order was intended to replace (only
     * provided if this Order was intended to replace an existing Order).
     * <p>
     * @return the Order ID to Replace
     * @see OrderID
     */
    public OrderID getIntendedReplacesOrderID() {
        return this.intendedReplacesOrderID;
    }

    /**
     * Set the Order ID to Replace
     * <p>
     * The ID of the Order that this Order was intended to replace (only
     * provided if this Order was intended to replace an existing Order).
     * <p>
     * @param intendedReplacesOrderID the Order ID to Replace as an OrderID
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see OrderID
     */
    public StopLossOrderRejectTransaction setIntendedReplacesOrderID(OrderID intendedReplacesOrderID) {
        this.intendedReplacesOrderID = intendedReplacesOrderID;
        return this;
    }
    /**
     * Set the Order ID to Replace
     * <p>
     * The ID of the Order that this Order was intended to replace (only
     * provided if this Order was intended to replace an existing Order).
     * <p>
     * @param intendedReplacesOrderID the Order ID to Replace as a String
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see OrderID
     */
    public StopLossOrderRejectTransaction setIntendedReplacesOrderID(String intendedReplacesOrderID) {
        this.intendedReplacesOrderID = new OrderID(intendedReplacesOrderID);
        return this;
    }

    @SerializedName("rejectReason") private TransactionRejectReason rejectReason;

    /**
     * Get the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @return the Reject Reason
     * @see TransactionRejectReason
     */
    public TransactionRejectReason getRejectReason() {
        return this.rejectReason;
    }

    /**
     * Set the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @param rejectReason the Reject Reason as a TransactionRejectReason
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TransactionRejectReason
     */
    public StopLossOrderRejectTransaction setRejectReason(TransactionRejectReason rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }
}