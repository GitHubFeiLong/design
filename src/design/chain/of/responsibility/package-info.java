/**
 * 包描述：
 * <a href="https://refactoringguru.cn/design-patterns/chain-of-responsibility">责任链模式（对象模式-行为型模式）</a>
 * <pre>
 *     模式说明：避免将一个请求的发送者与接收者耦合在一起，让多个对象都有机会处理请求。将接收请求的对象连接成一条链，并且沿着这条链传递请求，直到有一个对象能够处理它为止。
 *     角色：抽象处理者，具体处理者。
 * </pre>
 * @author cfl
 * @date 2022/12/8 20:16
 * @version 1.0
 */
package design.chain.of.responsibility;