public interface MessageInterface {
String getSenderName();
String getReceiverName();
String getTextMessage();
MessageStatus getStatus();
void setStatus (MessageStatus status);
}
