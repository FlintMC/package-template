package your.group.chat;

import net.flintmc.framework.config.annotation.Config;
import net.flintmc.framework.config.defval.annotation.DefaultString;

@Config
public interface ChatConfig {

  @DefaultString("Reminder!")
  String getReminderMessage();

  void setReminderMessage(String reminderMessage);

}
