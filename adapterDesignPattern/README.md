Adapter Design Pattern

The Adapter Design Pattern is a structural design pattern that allows two incompatible interfaces to work together.

The easiest way to remember it:

Adapter converts the interface of an existing class into an interface expected by the client.

Think of a mobile charger adapter:

Wall Socket
     ↓
  Adapter
     ↓
Mobile Charger

The wall socket and charger may have different interfaces, but the adapter makes them compatible.

1. The Problem

Suppose your application expects this interface:

interface PaymentProcessor {
    void pay(double amount);
}

Your application works with:

PaymentProcessor processor;
processor.pay(1000);

Now you want to integrate a third-party payment library.

The third-party library has:

class Razorpay {

    public void makePayment(double amount) {
        System.out.println(
            "Payment using Razorpay: " + amount
        );
    }
}

The problem is:

Your application expects:

PaymentProcessor
      ↓
pay()


Third-party library provides:

Razorpay
      ↓
makePayment()

The method names are different.

You cannot directly use:

PaymentProcessor processor = new Razorpay();

because Razorpay doesn't implement PaymentProcessor.

2. Solution: Adapter

Create an adapter between them:

             PaymentProcessor
                    ↑
                    |
                  Adapter
                    |
                    ↓
                Razorpay

The adapter implements the interface your application expects and internally calls the third-party API.


6. Understand the Architecture

There are four important components.

Target

The interface expected by the client.

PaymentProcessor
Adaptee

The existing class whose interface doesn't match.

Razorpay
Adapter

The class that converts one interface into another.

RazorpayAdapter
Client

The code that wants to use the Target interface.

Main

Overall:

                    Client
                       |
                       ↓
              PaymentProcessor
                << interface >>
                       ↑
                       |
               RazorpayAdapter
                       |
                       ↓
                   Razorpay
                 << existing >>
7. Why is Adapter Useful?

Imagine your application has:

PaymentProcessor

and you want to support:

Razorpay
Stripe
PayPal
Google Pay

Each external service may have a different API.

For example:

Razorpay
    makePayment()

Stripe
    createCharge()

PayPal
    executePayment()

Your application doesn't want to deal with all these different APIs.

Instead:

                 PaymentProcessor
                       ↑
          ┌────────────┼────────────┐
          │            │            │
          ↓            ↓            ↓
   RazorpayAdapter StripeAdapter PayPalAdapter
          │            │            │
          ↓            ↓            ↓
      Razorpay       Stripe       PayPal

Now your business logic simply does:

processor.pay(amount);

It doesn't care which payment provider is underneath.

8. Very Important LLD Example

Suppose you're building an e-commerce system.

Your internal application has:

interface NotificationService {

    void send(String message, String recipient);
}

But an external SMS library provides:

sendSMS(phoneNumber, message)

And an email library provides:

sendEmail(email, subject, message)

You can create adapters:

                    NotificationService
                           ↑
             ┌─────────────┴─────────────┐
             │                           │
             ↓                           ↓
       SMS Adapter                  Email Adapter
             │                           │
             ↓                           ↓
        SMS Library                Email Library

Your application only knows:

NotificationService

This is a very common use of Adapter in real systems.

9. Adapter vs Facade

Since you've been learning Facade, this distinction is important.

Adapter

Converts an interface.

Client
  ↓
Expected Interface
  ↓
Adapter
  ↓
Existing Interface

Its goal is compatibility.

"Make this existing class compatible with what I expect."

Facade

Simplifies a complex subsystem.

Client
  ↓
Facade
  ↓
Service A
Service B
Service C

Its goal is simplification.

"Hide this complicated subsystem behind a simple interface."

10. Adapter vs Proxy

These can also look similar.

Adapter

The interfaces are different.

Client
 ↓
Target Interface
 ↓
Adapter
 ↓
Adaptee

Purpose:

Convert interface.

Proxy

The interfaces are generally the same.

Client
 ↓
Proxy
 ↓
Real Object

Purpose:

Control access to the real object.

For example:

Proxy → Authentication
Proxy → Authorization
Proxy → Caching
Proxy → Lazy loading
11. Adapter vs Decorator
Adapter

Changes the interface.

Interface A
     ↓
 Adapter
     ↓
Interface B
Decorator

Keeps the same interface but adds behavior.

Service
   ↓
Logging Decorator
   ↓
Caching Decorator
   ↓
Real Service

So:

Adapter = change interface

Decorator = add behavior

12. Object Adapter vs Class Adapter

There are two common forms.

Object Adapter

The adapter contains an object of the adaptee.

Adapter
   |
   └── has-a → Adaptee

Example:

class RazorpayAdapter implements PaymentProcessor {

    private Razorpay razorpay;
}

This is the most common approach in Java because Java doesn't support multiple class inheritance.

Class Adapter

The adapter inherits from the adaptee and implements the target interface.

Conceptually:

Adapter
  |
  ├── extends Adaptee
  |
  └── implements Target

Java's single inheritance makes this approach less flexible.

13. When Should You Use Adapter?

Use Adapter when:

You need to integrate a third-party library.
Existing code has an incompatible interface.
You cannot modify the existing class.
You want to isolate external APIs from your business logic.
Multiple external implementations provide similar functionality differently.
You want your application to depend on your own abstraction rather than vendor-specific APIs.
14. LLD Interview Definition

If an interviewer asks:

What is the Adapter Design Pattern?

A good answer is:

Adapter is a structural design pattern that allows incompatible interfaces to work together. It wraps an existing class and translates the interface expected by the client into the interface provided by the existing class.

Remember this diagram:

                 CLIENT
                    |
                    ↓
             TARGET INTERFACE
                    ↑
                    |
                 ADAPTER
                    |
                    ↓
                ADAPTEE
One-line memory trick

Adapter = "Convert this interface so I can use it."