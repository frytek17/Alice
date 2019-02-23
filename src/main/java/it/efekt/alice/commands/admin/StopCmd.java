package it.efekt.alice.commands.admin;

import it.efekt.alice.commands.core.Command;
import it.efekt.alice.commands.core.CommandCategory;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class StopCmd extends Command {

    public StopCmd(String alias) {
        super(alias);
        setIsAdminCommand(true);
        setCategory(CommandCategory.BOT_ADMIN);
    }

    @Override
    public boolean onCommand(MessageReceivedEvent e) {
        Runtime.getRuntime().exit(0);
        return true;
    }
}
