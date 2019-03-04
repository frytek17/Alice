package it.efekt.alice.commands.fun;

import it.efekt.alice.commands.core.Command;
import it.efekt.alice.commands.core.CommandCategory;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class LoliCmd extends Command {
    public LoliCmd(String alias) {
        super(alias);
        setCategory(CommandCategory.FUN);
    }

    @Override
    public boolean onCommand(MessageReceivedEvent e) {
        e.getChannel().sendMessage("FBI OPEN UP").complete();
        return true;
    }
}
